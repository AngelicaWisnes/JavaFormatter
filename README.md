# JavaFormatter
This formatter is the result of a term-project in the course INF225, at UiB.

**NOTE: This README serves as an explanation on how the formatter works.**

## Project Structure
**NOTE: The actual work of the project starts in the file called _FileScanner_. To make faster sense of the project, you 
can jump down to that header. Everything before that header, is just a brief explanation of how the _FileScanner_ is 
initialized.** 

The project is set up as follows:
- _src_
    - _main_ 
        - _antlr4_
            - _no.uib.inf225.java_formatter_
                - File: _Java9_
        - _java_
            - _no.uib.inf225.java_formatter_
                - _io_
                    - _File: DirectoryScanner_
                    - _File: FileScanner_
                - _rules_
                    - _File: DefaultStyle_
                    - _File: IStyle_
                    - _File: JavaFormatter_
                - _test_classes_
                    - Files: Diverse classes used for testing the in- and output of the formatter.
                - _util_
                    - Files: Diverse classes used for console-printing
                - _File: GlobalQuickConfig_
                - _File: JavaListener_
                - _File: Main_
        - _resources_
            - _Files: xml-class used for configuring logger_

### GlobalQuickConfig
To make it easier to quickly change important settings, those settings are combined in a single file _GlobalQuickConfig_. 

At the moment this file only consists of three variables with corresponding getters:
- Path to directory root
- List of file-extensions that the formatter should care about. (All other file-extensions are ignored by the formatter.)
- What style-set the formatter should use. (At the moment, this is redundant, since the project only has one style-set, 
but this allows for easier extension of the project.)

### Main
The _Main_-class' only task is to start the formatter-"program" by getting the root-path, and starting the 
_DirectoryScanner_ with the help of the path-parameter.

### DirectoryScanner
The _DirectoryScanner_ traverses the directory, from the given path, and initializes the 
_FileScanner_ every time it finds a file with a file-extension that matches one from the list in _GlobalQuickConfig_.

### FileScanner
This is where the actual work **starts**.

The initializing method _scan_ takes in the complete path to a given file (including the whole file-name)
and starts the handle-method.

**NOTE: At the current moment, the _scan_-method is overridden, to just care about one single file, and ignore any 
other.** 

This method reads the given file as a FileInputStream, and creates a new file as a FileOutputStream. When the project 
is done, this output should overwrite the original file, but at this moment that is not done (for debugging purposes).

Then the method initializes a ParseTree (and everything needed to do so), based on the generated classes from the 
antlr4-grammar, and uses this ParseTree along with an instance of the _JavaListener_ to start a walker.

### JavaListener
This listener-class is instantiated with the same FileOutputStream that was created in the _FileScanner_.

Now, every time the _JavaListener_ notices the walker entering or exiting a grammar-generated rule, or visiting a 
TerminalNode, the _JavaFormatter_ is given the corresponding information.

### JavaFormatter
This is where the actual formatting-process is done. However, all logic related to the formatting-style, is kept in it's 
own style-class.

To keep track of the nesting of the grammar-rules, the rules are added and removed from a stack, every time the process 
is entering or exiting a rule. If the rules themselves should result in a new line, this is added here.

Otherwise, when the process is reaching a TerminalNode, the style-class is thoroughly checked to determine where there 
should be spaces, indentations, and new lines.
# gradle-antlr-example
An example of using ANTLR to generate a Parser and Lexer using Gradle.

## Building the Example
Run the following command to build the example:

    ./gradlew clean build
    
## Running the Example
Run the following command to start the example:

    ./gradlew run
    
If successful, you will see each expression found during parsing printed to the console:

    > Task :run
    [main] INFO example.antlr.Main - Running the example...
    [main] INFO example.antlr.MyListener - 100+2*6
    [main] INFO example.antlr.MyListener - 100
    [main] INFO example.antlr.MyListener - 2*6
    [main] INFO example.antlr.MyListener - 2
    [main] INFO example.antlr.MyListener - 6
    
## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/gradle-antlr-example/issues).

## License
MIT License

Copyright (c) 2019 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
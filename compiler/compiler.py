import sys

import sys
from antlr4 import *
from CLexer import CLexer
from CParser import CParser
from MyVisitor import MyVisitor

def main(argv):
    input = FileStream("test.c")
    lexer = CLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CParser(stream)
    tree = parser.compilationUnit()
    v = MyVisitor()
    f = open("test.py", "w")
    f.write(v.visit(tree))
    f.close()

if __name__ == '__main__':
    main(sys.argv)
    
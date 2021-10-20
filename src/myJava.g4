    grammar myJava;


    program     : ('public' | 'private' | 'protected') 'class' ID '{' statement+ '}';
    statement   : assign | add | sub | mul | div | print;
    assign      : ('int' ID | ID) '=' (NUMBER | ID) ';';
    add         : ID  '+=' (NUMBER | ID) ';';
    sub         : ID  '-=' (NUMBER | ID) ';';
    mul         : ID  '*=' (NUMBER | ID) ';';
    div         : ID  '/=' (NUMBER | ID) ';';
    print       : 'System.out.println(' (NUMBER | ID) ')' ';';


    ID         : [a-z]+;
    NUMBER     : [0-9]+;
    WS         : [ \t\r\n]+ -> skip;

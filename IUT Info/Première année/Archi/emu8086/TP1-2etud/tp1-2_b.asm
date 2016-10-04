; EXO9b.asm 
PILE        SEGMENT STACK
            DB      256 DUP(?)
PILE        ENDS
DONNEES     SEGMENT
DONNEES     ENDS
CODE        SEGMENT
            ASSUME   CS:CODE, DS:DONNEES
            extrn prbyte : far
            extrn crout : far
EXO9b        PROC     FAR
            PUSH     DS
            MOV      AX,0
            PUSH     AX
            MOV      AX,DONNEES
            MOV      DS,AX
            ;
           
            RET
EXO9b        ENDP
CODE        ENDS
            END EXO9b
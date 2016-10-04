
PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT 
    TAILLE db 40
    TAB db 'Ceci est un essai de parcours de tableau'
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 

main:	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ; dans le segment de donnees	

	MOV AX,PILE
	MOV SS,AX
        
   
    ....
	   
	MOV AH,4CH
	INT 21H
CODE ENDS
END main


PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT
    chaine DB 'Hello',13,10,'$' ; la chaine a afficher doit se terminer par '$'.
                                ; 13,10 affichent des retour a la ligne
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 

main:	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ; dans le segment de données	

	MOV AX,PILE
	MOV SS,AX
        
	MOV AX,0

	MOV DX, OFFSET Chaine   ; Met dans DX l'adresse de la chaine a afficher
	MOV AH,09H 			    ; affichage de la 
	INT 21H			        ; chaine de caracteres dont l'adresse est dans DX

	MOV AH,4CH
	INT 21H
CODE ENDS
END main

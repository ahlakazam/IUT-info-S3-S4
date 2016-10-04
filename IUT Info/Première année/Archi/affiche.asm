
PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT 
    TAILLE db 40
    TAB db 'Ceci est un essai de parcours de tableau$' 
    hour db 'Il est actuellement : $'
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 

main PROC	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ; dans le segment de donnees	

	MOV AX,PILE
	MOV SS,AX


    ;Code perso
Boucle :  
    MOV AH,09h
    MOV DX,Offset hour
    INT 21H
    MOV AH,2Ch
    INT 21H 
    MOV AL,CH
    call Affiche_int  
    MOV AL,CL
    call Affiche_int
    MOV AL,DH
    call Affiche_int
    MOV DL,13d
    MOV AH,02h
    INT 21h
   
loop Boucle
    
    MOV AH,4CH
	INT 21H
main ENDP 

Affiche_int PROC 
    MOV AH,0	                 
    MOV BL,10
    DIV BL
    MOV BX,AX
    MOV DL,BL
    ADD DL,'0'  
    MOV AH,02h
    INT 21H
    MOV DL,BH   
    ADD DL,'0' 
    INT 21H 
    MOV DL,' '
    INT 21H
    MOV AH,0 
    ret   
Affiche_int ENDP
CODE ENDS
END main

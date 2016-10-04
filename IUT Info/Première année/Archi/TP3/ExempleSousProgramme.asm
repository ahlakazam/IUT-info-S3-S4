
PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA     SEGMENT
ValX	    dw      ? 

DATA     ENDS


CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 



main PROC 	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ;Dans le segment de donnees	

	MOV AX,PILE     ;Positionnement de DS 
	MOV SS,AX       ;Dans le segment de PILE
        
	
	; appel du sous programme
 	
	CALL  SousProgramme


	MOV AH,4CH
	INT 21H

main ENDP

SousProgramme	PROC 	
    MOV AX, 1111h
    MOV ValX, AX
	ret     
SousProgramme ENDP


CODE ENDS
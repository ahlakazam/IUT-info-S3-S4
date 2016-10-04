
PILE SEGMENT STACK
    DW 512 DUP(?)
    Base:
PILE ENDS

DATA     SEGMENT
ValX	    dw      ?
resultat db 0 

DATA     ENDS


CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 



main PROC 	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ;Dans le segment de donnees	

	MOV AX,PILE     ;Positionnement de DS 
	MOV SS,AX       ;Dans le segment de PILE
        
	MOV AX,10
	MOV BX,20 
	PUSH AX  
	PUSH BX
	
	; appel du sous programme
 	
    Call moyenne


	MOV AH,resultat 
	ADD AH,'0'
	INT 21H

main ENDP
  

moyenne PROC  
    PUSH BP
    MOV BP,SP
    MOV AX,[BP+4]
    MOV BX,[BP+6]
    ADD AX,BX
    MOV BL,2
    DIV BL
    MOV resultat,AL
    POP BP  
    ret 4
moyenne ENDP


CODE ENDS

PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT 
    X1 dW 3
    X2 dW 7 
    RES dW 0 
       
    
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 

main PROC	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ;dans le segment de donnees	

	MOV AX,PILE     ;Positionnement de SS
	MOV SS,AX       ; dans le segment de Pile 
        
    ;le code commence ici 
    ; passage de parametres 
     
                       
    PUSH X1
    PUSH X2
    call Moyenne 
    ; le resultat est dans AX 
    mov RES, AX           
     
   
	; retour au dos fin de programme   
	MOV AH,4CH
	INT 21H 
	main ENDP          



Moyenne PROC
    
     PUSH BP
     MOV BP,SP
     ; Procedure 
     MOV AX, [BP+6]
     ADD AX, [BP+4] 
     MOV BL, 2
     DIV BL
       
     POP BP 
     RET 4 ; ret 4 va depiler les 2 parametres empiles
     
Moyenne ENDP    


CODE ENDS
END main

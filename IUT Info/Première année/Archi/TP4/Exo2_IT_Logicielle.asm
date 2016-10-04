; Exo2_IT_Logicielle
PILE        SEGMENT STACK
	    DB      256 DUP(?)
PILE        ENDS

DONNEES     SEGMENT
	compteur db 0
DONNEES      ENDS

CODE        SEGMENT
	    ASSUME   CS:CODE, DS:DONNEES
	    

EXO2        PROC     FAR
	    PUSH     DS
	    MOV      AX,0
	    PUSH     AX
	    MOV      AX,DONNEES
	    MOV      DS,AX
	    ;
		

call  INSTALLATION_IT_150
		mov compteur,0
		iterer:
			mov dl, 'M'
			call cout
		  int 150
			cmp compteur, 10
			je fin
			mov dl, compteur 
			add dl, '0'
			call cout
			; carriage return
			mov dl,0Dh 
			call cout
		jmp iterer
		fin: 
		RET
EXO2       ENDP

VOTRE_PROCEDURE_DIT_150 PROC NEAR
	Inc compteur
	Mov dl,'I'
	Call cout
	iret
VOTRE_PROCEDURE_DIT_150 ENDP

INSTALLATION_IT_150 PROC NEAR
	Mov AH, 25h
	Mov AL,150
	Mov DX, OFFSET VOTRE_PROCEDURE_DIT_150
	; on met dans DS la valeur du segment de la procédure
MOV SI,CODE   	; SI prend la valeur du segment qui contient 
; la procédure
	PUSH SI		; on met SI sur la pile
	POP  DS 		; on dépile dans DS
	Int 21h
	ret
INSTALLATION_IT_150 ENDP  

COUT PROC near
    mov AH, 02
    int 21h
    ret     
COUT ENDP


CODE        ENDS
	    END EXO2

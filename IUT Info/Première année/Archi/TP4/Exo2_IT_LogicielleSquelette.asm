; TP4_2.asm 
PILE        SEGMENT STACK
	    DB      256 DUP(?)
PILE        ENDS

DONNEES     SEGMENT
	compteur db 0
DONNEES      ENDS

CODE        SEGMENT
	    ASSUME   CS:CODE, DS:DONNEES
	    extrn prbyte : far
	    extrn crout : far
	    extrn cout : far
IT150        PROC     FAR
	    PUSH     DS
	    MOV      AX,0
	    PUSH     AX
	    MOV      AX,DONNEES
	    MOV      DS,AX
	    ;
		
		...
		RET
IT150        ENDP

VOTRE_PROCEDURE_DIT_150 PROC NEAR
	...
	iret
VOTRE_PROCEDURE_DIT_150 ENDP

INSTALLATION_IT_150 PROC NEAR
	...
	ret
INSTALLATION_IT_150 ENDP

CODE        ENDS
	    END IT150

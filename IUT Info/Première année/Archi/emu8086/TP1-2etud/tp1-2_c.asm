; EX09c.asm 
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
EXO9c        PROC     FAR
	    PUSH     DS
	    MOV      AX,0
	    PUSH     AX
	    MOV      AX,DONNEES
	    MOV      DS,AX
	    ;
		
		...
		RET
EXO9c       ENDP

VOTRE_PROCEDURE_DIT_150 PROC NEAR
	...
	iret
VOTRE_PROCEDURE_DIT_150 ENDP

INSTALLATION_IT_150 PROC NEAR
	...
	ret
INSTALLATION_IT_150 ENDP

CODE        ENDS
	    END EXO9c

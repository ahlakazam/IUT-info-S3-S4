; Correction Exo1_IntHorloge.asm
STACK SEGMENT
   DW 256 DUP (0)
base:
STACK ENDS 

DATA SEGMENT
   msg	DB	'L heure actuelle est : $'

DATA ENDS

CODE SEGMENT
   ASSUME CS:CODE, DS:DATA, SS:STACK  
   
   ;Converti le premier parametre (valeur entre 0 et 99) en 2 caracteres ASCII
   ;IN   : parametre 1 : la valeur a convertir en texte
   ;     : parametre 2 : vide, il sert juste pour le retour
   ; OUT : parametre 1 : la valeur ASCII de l'unite
   ;     : parametre 2 : la valeur ASCII de la dizaine
   convertionValeurASCII PROC  NEAR 
    
    PUSH BP
    PUSH AX
    PUSH BX

    
    MOV BP, SP
    MOV AX, [BP+10]
    
    MOV BL, 10
    DIV BL
    
    ; AH Reste, AL Quotient 
    MOV BL, AH
    MOV BH, 0
    ADD BX, 48
    
    MOV [BP+10], BX
    
    MOV AH, 0
    ADD AX, 48
    
    MOV [BP+8], AX
    

    POP BX
    POP AX
    POP BP
   
   
    RET
   
   convertionValeurASCII ENDP
   afficheEntier proc near

   afficheEntier endp
   
debut:
   
   MOV AX, Data
   MOV DS, AX

   MOV AX, Stack
   MOV SS, AX 
   MOV SP, base  
   
   MOV SI, 10 
   
   ; Affichage
	MOV 	DX, OFFSET msg
	MOV 	AH, 9
	INT 	21h

boucle:
    MOV DH, 0
	MOV DL, 22
	MOV BH, 0
	MOV AH, 2
	INT 10h 


	; Appel de l'interruption
	MOV	AH, 2Ch
    INT	21h  
    
	; CH : Heure, CL Minutes, DH Secondes, DL centiemes de s.     
    	MOV BX, DX ; sauvegarde de DX qui contient les secondes et les 100eme
    
    	; gestion des heures
    
    	MOV DH,0
    
    	MOV DL, CH
    	PUSH DX
    	PUSH DX ; sert juste a avoir un 2eme param de retour
    
    	CALL convertionValeurASCII
    
    	POP DX
   	    MOV AH, 02
    	INT 21h  
    
    	POP DX
   	    MOV AH, 02
   	    INT 21h
    
    	MOV DL, 'h'
    	MOV AH, 02
    	INT 21h  
    
    	; gestion des minutes
    
    	MOV DH,0
    
   	MOV DL, CL
    	PUSH DX
    	PUSH DX ; sert juste a avoir un 2eme param de retour
    
    	CALL convertionValeurASCII
    
    	POP DX
    	MOV AH, 02
    	INT 21h  
    
    	POP DX
    	MOV AH, 02
    	INT 21h
    
    	MOV DL, 'm'
    	MOV AH, 02
    	INT 21h
    
    	; gestion des secondes
    
    	MOV DH,0
    
    	MOV DL, BH
    	PUSH DX
    	PUSH DX ; sert juste a avoir un 2eme param de retour
    
    	CALL convertionValeurASCII
    
    	POP DX
    	MOV AH, 02
    	INT 21h  
    
    	POP DX
    	MOV AH, 02
    	INT 21h
    
    	MOV DL, 's'
    	MOV AH, 02
    	INT 21h 
    
    	; gestion des 100eme de secondes
    
    	MOV DH,0
    
    	MOV DL, BL
    	PUSH DX
    	PUSH DX ; sert juste a avoir un 2eme param de retour
    
    	CALL convertionValeurASCII
    
    	POP DX
    	MOV AH, 02
    	INT 21h  
    
    	POP DX
    	MOV AH, 02
    	INT 21h
    
    	;gestion de la boucle 
    	MOV DL, 10
    	MOV AH, 02
    	INT 21h
    	MOV DL, 13
    	INT 21h   
    
    	DEC SI
    
    	CMP SI,0
    JNE boucle
    

fin:            
   MOV AH, 4CH 
   INT 21H  
CODE ENDS
END debut


PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT 
    X1 dW 0
    X2 dW 0 
    RES dW 0 
    msg1 db 0Dh,0Ah, " Entrez un nombre entre -32768 et 65535:  $"  
    bufferX1 db 7,?, 5 dup (1),'$', 0
    bufferX2 db 7,?, 5 dup (2),'$', 0
     
    
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

     ; Saisir la premiere chaine 
     ; aparametre @chaine dans SI
     
        mov SI, offset bufferX1
        call SaisieChaine                   
                          
     ; Saisir la deuxieme chaine 
     ; aparametre @chaine dans SI
     
        mov SI, offset bufferX2
        call SaisieChaine   
        
     ; On appelle la fonction ChaineToEntier pour le 1er buffer    
     ; calcul de la valeur entiere de la chaine 
     ; format dans la memoire ?00000$ , ?est la taille
     ; si on tape 123 buffer aura comme format 312300$ 
     
     ; on met le nombre de digit dans CX   
        mov CL, bufferX1[1] 
        mov CH, 0 
     ; on met l'adresse du buffer dans SI
        mov SI, offset bufferX1 +2
                       
        CALL ChaineToEntier   
             
     ; on recupere le resultat dans X1
        mov X1,AX
        
     ; On appelle la fonction ChaineToEntier  pour le 2eme buffer    
     ; on met le nombre de digit dans CX   
        mov CL, bufferX2[1] 
        mov CH, 0 
     ; on met l'adresse du buffer dans SI
        mov SI, offset bufferX2 +2
        
        
     ; On appelle la fonction ChaineToEntier  
        CALL ChaineToEntier        
     ; on recupere le resultat dans X1
        mov X2,AX 
                      
        mov CX,X1
        mov DX,X2  
        call Moyenne 
     ; le resultat est dans AX 
        mov RES, AX           
     
     ;retour au dos fin de programme   
	    MOV AH,4CH
	    INT 21H 
main ENDP          

SaisieChaine PROC 
    ; SI contient l'adresse de la zone ou on doit stocker la chaine    
    ; print welcome message:
        mov dx, offset msg1
        mov ah, 9
        int 21h
        
     ; input string:
        mov dx, SI
        mov ah, 0ah
        int 21h
     
     ; affichage chaine
        add SI, 1 
        mov dX, SI
        mov ah, 09h
        int 21h 
        ret
SaisieChaine ENDP     

ChaineToEntier PROC
    ; parametres: CX contient le nb digit
    ; SI adresse du début de la chaine
     
        ; AX porte le resultat  
        mov AX,0 
        mov DX,0
       boucle: 
        mov DL,[SI]  ; on met le premier caractere  dans DL
        sub DL,'0'    ; transformation en chiffre 
        ADD AX,DX         ; ajout a BX
        INC SI         ;incrémentation de SI 
        cmp CX,1      ; verification si autre iteration 
        je fin 
           MOV BX,10
           MUL BX  
        fin:
        loop boucle 
        ret
ChaineToEntier ENDP

Moyenne PROC
    
     MOV AX, CX
     ADD AX, DX
     MOV BL, 2 
     DIV BL
     
     ret
Moyenne ENDP

CODE ENDS
END main

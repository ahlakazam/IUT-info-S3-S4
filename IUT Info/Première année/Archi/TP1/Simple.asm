PILE SEGMENT STACK
DW 256 DUP(?)  
base:
PILE ENDS

DATA SEGMENT
N1 DW 5
N2 DW 3
N3 DW 3 DUP(?)
N4 DB ?
DATA ENDS

CODE SEGMENT
;ceci est un commentaire
; positionnement des registres de segment.
ASSUME CS:CODE, DS:DATA, SS:PILE 

main:

MOV AX,DATA ; initialisation du segment de données
MOV DS,AX
MOV AX,PILE
MOV SS,AX ; initialisation du segment de pile
MOV SP,Base

; Code du programme 
MOV AX,N1
CMP AX,N2
JE etiq
MOV N4,0
JMP fin
etiq:
MOV N4,1
fin:

MOV AH,4CH ; Les 2 lignes nécessaires pour la…
INT 21H ; …fin du programme
CODE ENDS
END main

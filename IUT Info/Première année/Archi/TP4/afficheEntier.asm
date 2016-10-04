; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "press any key...$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start proc
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here
            
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    mov AL, 12
    call affiche_int
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h 
    
start endp  
affiche_int proc
    ; la valeur a afficher est dans AL 
    mov AH, 0 
    mov BL, 10
    DIV BL ; DIV : division entiere
    ; resultat dans AL 
    ; reste de la division dans AH 
    mov BX, AX 
    mov AH, 02h 
    add BL, '0'
    mov DL , BL
    int 21h 
    add BH, '0'
    mov DL, BH
    int 21h 
    ret
 affiche_int endp

    
ends
     
     

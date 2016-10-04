PILE SEGMENT STACK
    DW 256 DUP(?)
    Base:
PILE ENDS

DATA SEGMENT 
    all_red   dw     0000_0010_0100_1001b
    all_green   dw     0000_1001_0010_0100b 
    end_traffic dw     0000_0010_0100_1001b

DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:PILE 

main:	
    MOV AX,DATA     ;Positionnement de DS  
	MOV DS,AX	    ; dans le segment de donnees	

	MOV AX,PILE
	MOV SS,AX
        
   ; initialement on met tous les feux a rouge 
    mov si, offset all_red
suite: 
    mov ax, [si]
    out 4, ax	

    ; on attend 5 seconds (5 million microseconds)
    mov     cx, 4Ch    ;    004C4B40h = 5,000,000
    mov     dx, 4B40h
    mov     ah, 86h
    int     15h 
   
   ; on les mets tous a vert 
   add si, 2 ; next situation 
   cmp si, end_traffic
   jne  suite
   
   jmp end
end:
   
	MOV AH,4CH
	INT 21H
CODE ENDS
END main






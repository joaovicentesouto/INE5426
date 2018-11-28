	.text
	.file	"code.ll"
	.globl	func
	.align	16, 0x90
	.type	func,@function
func:                                   # @func
	.cfi_startproc
# BB#0:                                 # %entry
	imull	%esi, %edi
	movl	%edi, %eax
	retq
.Lfunc_end0:
	.size	func, .Lfunc_end0-func
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:                                 # %entry
	movl	$7, -4(%rsp)
	movb	$1, %al
	testb	%al, %al
	jne	.LBB1_2
# BB#1:                                 # %label1
	movl	-4(%rsp), %eax
	addl	$2, %eax
	retq
.LBB1_2:                                # %label0
	movl	$90, %eax
	retq
.Lfunc_end1:
	.size	main, .Lfunc_end1-main
	.cfi_endproc


	.section	".note.GNU-stack","",@progbits

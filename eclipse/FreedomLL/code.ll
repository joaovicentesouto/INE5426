
define i32 @func(i32 %a, i32 %b) {
entry:
%tmp0 = mul i32 %a, %b
ret i32 %tmp0
}

define i32 @main() {
entry:
%x = alloca i32
store i32 0, i32* %x
%i = alloca i32
store i32 0, i32* %i
br label %label0
ret i32 0
label0:
%tmp7 = load i32, i32* %i
%tmp8 = icmp slt i32 %tmp7, 10
br i1 %tmp8, label %label1, label %label2
ret i32 0
label1:
%tmp1 = load i32, i32* %x
%tmp2 = add i32 %tmp1, 1
store i32 %tmp2, i32* %x
%tmp3 = load i32, i32* %i
%tmp4 = load i32, i32* %i
%tmp5 = add i32 %tmp4, 1
store i32 %tmp5, i32* %i
br label %label0
ret i32 0
label2:
%tmp9 = load i32, i32* %x
%tmp10 = icmp eq i32 %tmp9, 1
br i1 %tmp10, label %label5, label %label6
ret i32 0
label5:
store i32 11, i32* %x
br label %label3
ret i32 0
label6:
%tmp11 = icmp eq i32 %tmp9, 2
br i1 %tmp11, label %label7, label %label8
ret i32 0
label7:
store i32 22, i32* %x
br label %label3
ret i32 0
label8:
%tmp12 = icmp eq i32 %tmp9, 10
br i1 %tmp12, label %label9, label %label10
ret i32 0
label9:
store i32 33, i32* %x
br label %label3
ret i32 0
label10:
store i32 55, i32* %x
br label %label3
ret i32 0
br label %label3
ret i32 0
label3:
%tmp13 = load i32, i32* %x
ret i32 %tmp13
}
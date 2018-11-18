define i32 @main() {
%x = alloca i32
store i32 0, i32* %x
%i = alloca i32
store i32 0, i32* %i
br label %label0
ret i32 0
label0:
%tmp6 = load i32, i32* %i
%tmp7 = icmp slt i32 %tmp6, 10
br i1 %tmp7, label %label1, label %label2
ret i32 0
label1:
%tmp0 = load i32, i32* %x
%tmp1 = add i32 %tmp0, 1
store i32 %tmp1, i32* %x
%tmp2 = load i32, i32* %i
%tmp3 = load i32, i32* %i
%tmp4 = add i32 %tmp3, 1
store i32 %tmp4, i32* %i
br label %label0
ret i32 0
label2:
%j = alloca i32
store i32 5, i32* %j
br label %label3
ret i32 0
label3:
%tmp14 = load i32, i32* %j
%tmp15 = icmp sgt i32 %tmp14, 0
br i1 %tmp15, label %label4, label %label5
ret i32 0
label4:
%tmp8 = load i32, i32* %x
%tmp9 = sub i32 %tmp8, 1
store i32 %tmp9, i32* %x
%tmp10 = load i32, i32* %j
%tmp11 = load i32, i32* %j
%tmp12 = sub i32 %tmp11, 1
store i32 %tmp12, i32* %j
br label %label3
ret i32 0
label5:
%tmp16 = load i32, i32* %x
ret i32 %tmp16
}
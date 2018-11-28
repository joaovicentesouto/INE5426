
define i32 @main() {
entry:

%i = alloca i32
store i32 1, i32* %i

%j = alloca i32
store i32 100, i32* %j

br label %label0

ret i32 0
label0:

%tmp0 = load i32, i32* %i
%tmp1 = icmp slt i32 %tmp0, 101
br i1 %tmp1, label %label1, label %label4

ret i32 0
label1:

%tmp2 = load i32, i32* %j
%tmp3 = icmp sgt i32 %tmp2, 0
br i1 %tmp3, label %label2, label %label4

ret i32 0
label2:

%tmp4 = load i32, i32* %i
%tmp5 = load i32, i32* %j
%tmp6 = icmp ne i32 %tmp4, %tmp5
br i1 %tmp6, label %label3, label %label4

ret i32 0
label3:

%tmp7 = load i32, i32* %i
%tmp8 = add i32 %tmp7, 1
store i32 %tmp8, i32* %i
%tmp9 = load i32, i32* %j
%tmp10 = sub i32 %tmp9, 1
store i32 %tmp10, i32* %j
br label %label0

ret i32 0
label4:

%l = alloca i32
%tmp11 = load i32, i32* %i
%tmp12 = load i32, i32* %j
%tmp13 = add i32 %tmp11, %tmp12
store i32 %tmp13, i32* %l

%tmp14 = load i32, i32* %l
ret i32 %tmp12

}
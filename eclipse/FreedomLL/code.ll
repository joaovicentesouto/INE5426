define i32 @main() {
%x = alloca i32
%y = alloca i32
%tmp0 = mul i32 2, 10
store i32 %tmp0, i32* %x
store i32 2, i32* %y

%tmp1 = load i32, i32* %x
%tmp2 = sub i32 %tmp1, 2
store i32 %tmp2, i32* %x
%tmp3 = load i32, i32* %x
%tmp4 = icmp slt i32 %tmp3, 0
%tmp5 = icmp eq i1 %tmp4, 0
br i1 %tmp5, label %label0, label %label1
label1:
ret i32 111
br label %label2
label0:
ret i32 900
label2:
ret i32 0

}
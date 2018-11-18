define i32 @main() {
%x = alloca i32
store i32 2, i32* %x
%tmp0 = load i32, i32* %x
%tmp1 = icmp eq i32 %tmp0, 2
%tmp2 = icmp eq i1 %tmp1, 0
br i1 %tmp2, label %label0, label %label1
label1:
store i32 5, i32* %x
br label %label2
label0:
store i32 3, i32* %x
br label %label2
label2:
%tmp3 = load i32, i32* %x
ret i32 %tmp3

}
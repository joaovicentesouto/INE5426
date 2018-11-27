
define i32 @func(i32 %a, i32 %b) {
entry:
%tmp0 = mul i32 %a, %b
ret i32 %tmp0
}

define i32 @main() {
entry:
%x = alloca i32
store i32 2, i32* %x
%tmp1 = load i32, i32* %x
%tmp2 = call i32 @func(i32 %tmp1, i32 3)
store i32 %tmp2, i32* %x
%tmp3 = load i32, i32* %x
ret i32 %tmp3
}
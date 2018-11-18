%g = alloca i32
store i32 42, i32* %g
define i32 @main() {
%x = alloca i32
%y = alloca i32
%tmp0 = mul i32 2, 10
store i32 %tmp0, i32* %x
store i32 2, i32* %y
%tmp1 = load i32, i32* %x
%tmp2 = sub i32 %tmp1, 2
store i32 %tmp2, i32* %x
%tmp3 = load i32, i32* %g
ret i32 %tmp3
}
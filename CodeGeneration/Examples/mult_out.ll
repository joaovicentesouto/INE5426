
define i32 @main() {
entry:

%i = alloca i32
%tmp0 = add i32 1, 3
store i32 %tmp0, i32* %i
%j = alloca i32
store i32 5, i32* %j

%tmp1 = load i32, i32* %i
%tmp2 = load i32, i32* %j
%tmp3 = mul i32 %tmp1, %tmp2
ret i32 %tmp3
}
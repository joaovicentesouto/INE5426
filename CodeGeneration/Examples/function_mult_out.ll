
define i32 @mult(i32 %a, i32 %b) {
entry:
%tmp0 = mul i32 %a, %b
ret i32 %tmp0
}


define i32 @main() {
entry:

%i = alloca i32
%tmp1 = add i32 1, 3
store i32 %tmp1, i32* %i
%j = alloca i32
store i32 5, i32* %j

%tmp2 = load i32, i32* %i
%tmp3 = load i32, i32* %j
%tmp4 = call i32 @mult(i32 %tmp2, i32 %tmp3)
ret i32 %tmp4
}
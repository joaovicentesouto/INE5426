
define i32 @func(i32 %a) {
entry:
%tmp0 = add i32 %a, 2
ret i32 %tmp0
}

define i32 @main() {
entry:
%x = alloca i32
store i32 42, i32* %x
call i32 @func(%tmp1 = load i32, i32* %x
)store i32 , i32* %x
%tmp2 = load i32, i32* %x
ret i32 %tmp2
}
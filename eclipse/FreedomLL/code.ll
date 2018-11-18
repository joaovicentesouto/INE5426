define i32 @main() {
%x = alloca i32
%y = alloca i32
%tmp0 = add i32 2, 3
store i32 %tmp0, i32* %x
store i32 4, i32* %y
ret  42
}
@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
declare i32 @printf(i8*, ...)
define void @print(i32 %i) {
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)
  ret void
}

define i32 @main() {
entry:

%i = alloca i32
store i32 0, i32* %i
br label %label0
ret i32 0
label0:

%tmp5 = load i32, i32* %i
%tmp6 = icmp slt i32 %tmp5, 10
br i1 %tmp6, label %label1, label %label2
ret i32 0
label1:

%tmp0 = load i32, i32* %i
call void @print(i32 %tmp0)

%tmp1 = load i32, i32* %i
%tmp2 = load i32, i32* %i
%tmp3 = add i32 %tmp2, 1
store i32 %tmp3, i32* %i
br label %label0
ret i32 0
label2:

ret i32 0
}
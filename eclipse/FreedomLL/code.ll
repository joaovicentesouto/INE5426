@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
declare i32 @printf(i8*, ...) #1
define void @print(i32 %i) {
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)
  ret void
}

define i32 @main() {
entry:

%i = alloca i32
store i32 0, i32* %i

call void @print(i32 -1)

br label %label0

ret i32 0
label0:

%tmp3 = load i32, i32* %i
%tmp4 = icmp slt i32 %tmp3, 100

br i1 %tmp4, label %label1, label %label2

ret i32 0
label1:

%tmp0 = load i32, i32* %i
%tmp1 = add i32 %tmp0, 1
store i32 %tmp1, i32* %i
%tmp2 = load i32, i32* %i
call void @print(i32 %tmp2)


br label %label0

ret i32 0
label2:

call void @print(i32 -1)

%tmp5 = load i32, i32* %i
ret i32 %tmp5
}
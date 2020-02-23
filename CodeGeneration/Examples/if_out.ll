@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
declare i32 @printf(i8*, ...)
define void @print(i32 %i) {
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)
  ret void
}

define i32 @main() {
entry:

%x = alloca i32
%tmp0 = mul i32 10, 3
store i32 %tmp0, i32* %x

%tmp1 = load i32, i32* %x
%tmp2 = icmp eq i32 %tmp1, 30
%tmp3 = icmp eq i1 %tmp2, 0
br i1 %tmp3, label %label0, label %label1
label1:

%tmp4 = load i32, i32* %x
%tmp5 = sdiv i32 %tmp4, 3
store i32 %tmp5, i32* %x
br label %label2
label0:

%tmp6 = load i32, i32* %x
%tmp7 = sdiv i32 %tmp6, 2
store i32 %tmp7, i32* %x
br label %label2
label2:

%tmp8 = load i32, i32* %x
call void @print(i32 %tmp8)

ret i32 0
}
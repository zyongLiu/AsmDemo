package com.lyz.plugin.lifecycle;


import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class LifecycleMainOnCreateMethodVisitor extends MethodVisitor {

    public LifecycleMainOnCreateMethodVisitor(MethodVisitor mv) {
        super(Opcodes.ASM4, mv);
    }

    @Override
    public void visitCode() {
//        mv.visitLdcInsn("TAG");
//        mv.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder");
//        mv.visitInsn(Opcodes.DUP);
//        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
//        mv.visitLdcInsn("-------> onCreate : ");
//        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
//        mv.visitVarInsn(Opcodes.ALOAD, 0);
//        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
//        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
//        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
//        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
//        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "android/util/Log", "i", "(Ljava/lang/String;Ljava/lang/String;)I", false);
//        mv.visitInsn(Opcodes.POP);

        super.visitCode();
    }
    
    @Override
    public void visitInsn(int opcode) {
        if ((opcode>Opcodes.IRETURN&&opcode<=Opcodes.RETURN)||opcode==Opcodes.ATHROW) {
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "com/lyz/koala/MainActivity", "defaultCode", "()V", false);
        }
        super.visitInsn(opcode);
    }
}
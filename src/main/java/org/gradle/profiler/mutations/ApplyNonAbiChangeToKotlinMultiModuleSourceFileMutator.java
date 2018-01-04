package org.gradle.profiler.mutations;

import java.io.File;

public class ApplyNonAbiChangeToKotlinMultiModuleSourceFileMutator extends AbstractFileChangeMutator {
    public ApplyNonAbiChangeToKotlinMultiModuleSourceFileMutator(File sourceFile) {
        super(sourceFile);
    }

    @Override
    protected void applyChangeTo(StringBuilder text) {
        text.replace(
                0,
                text.length(),
                "package org.gradle.test.performance1_4\n" +
                        "open class Production1_315 {\n" +
                        "    private val property: String= \"foo\"\n" +
                        "    open fun getProperty(): String {\n" +
                        "        _m_1514985022436_2()\n" +
                        "        return property\n" +
                        "    }\n" +
                        "    fun _m_1514985022436_2() {\n" +
                        "        System.out.println(\"" + getUniqueText() + "\")\n" +
                        "    }\n" +
                        "}\n");
    }
}

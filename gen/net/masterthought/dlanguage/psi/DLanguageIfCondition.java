package net.masterthought.dlanguage.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import net.masterthought.dlanguage.psi.interfaces.DNamedElement;
import net.masterthought.dlanguage.stubs.DlangIfConditionStub;
import org.jetbrains.annotations.Nullable;


public interface DLanguageIfCondition extends PsiElement, DNamedElement, StubBasedPsiElement<DlangIfConditionStub> {
    @Nullable
    DlangIdentifier getIdentifier();

    @Nullable
    DLanguageExpression getExpression();

    @Nullable
    PsiElement getKW_AUTO();

    @Nullable
    DLanguageType getType();

    @Nullable
    PsiElement getOP_EQ();

}

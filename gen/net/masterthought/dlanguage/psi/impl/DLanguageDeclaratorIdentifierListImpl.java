// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageDeclaratorIdentifierListImpl extends ASTWrapperPsiElement implements DLanguageDeclaratorIdentifierList {

  public DLanguageDeclaratorIdentifierListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLanguageVisitor visitor) {
    visitor.visitDeclaratorIdentifierList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) accept((DLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageDeclaratorIdentifier getDeclaratorIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, DLanguageDeclaratorIdentifier.class));
  }

  @Override
  @Nullable
  public DLanguageDeclaratorIdentifierList getDeclaratorIdentifierList() {
    return PsiTreeUtil.getChildOfType(this, DLanguageDeclaratorIdentifierList.class);
  }

  @Override
  @Nullable
  public PsiElement getOpComma() {
    return findChildByType(OP_COMMA);
  }

}

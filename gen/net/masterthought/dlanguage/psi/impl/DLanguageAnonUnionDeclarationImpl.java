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

public class DLanguageAnonUnionDeclarationImpl extends ASTWrapperPsiElement implements DLanguageAnonUnionDeclaration {

  public DLanguageAnonUnionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLanguageVisitor visitor) {
    visitor.visitAnonUnionDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) accept((DLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageAggregateBody getAggregateBody() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, DLanguageAggregateBody.class));
  }

  @Override
  @NotNull
  public PsiElement getKwUnion() {
    return notNullChild(findChildByType(KW_UNION));
  }

}

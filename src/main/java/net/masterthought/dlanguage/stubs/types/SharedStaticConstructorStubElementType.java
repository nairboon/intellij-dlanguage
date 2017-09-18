package net.masterthought.dlanguage.stubs.types;

import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import net.masterthought.dlanguage.psi.DLanguageSharedStaticConstructor;
import net.masterthought.dlanguage.psi.impl.DLanguageSharedStaticConstructorImpl;
import net.masterthought.dlanguage.stubs.DlangSharedStaticConstructorStub;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class SharedStaticConstructorStubElementType extends DStubElementType<DlangSharedStaticConstructorStub, DLanguageSharedStaticConstructor> {
    public SharedStaticConstructorStubElementType(final String debugName) {
        super(debugName);
    }

    @Override
    public DLanguageSharedStaticConstructor createPsi(@NotNull final DlangSharedStaticConstructorStub stub) {
        return new DLanguageSharedStaticConstructorImpl(stub, this);
    }

    @NotNull
    @Override
    public DlangSharedStaticConstructorStub createStub(@NotNull final DLanguageSharedStaticConstructor psi, final StubElement parentStub) {
        return new DlangSharedStaticConstructorStub(parentStub, this);
    }

    @NotNull
    @Override
    public DlangSharedStaticConstructorStub deserialize(@NotNull final StubInputStream dataStream, final StubElement parentStub) throws IOException {
        return new DlangSharedStaticConstructorStub(parentStub, this);
    }
}

package com.nyeroos.firstlesson.JV20.pr21.ex3;

public class ICreateDocument implements IDocument {
    public IDocument CreateNew() {
        IDocument iDocument = new IDocument() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        new TextDocument();
        return iDocument;
    }

    public IDocument CreateOpen() {
        IDocument iDocument = new IDocument() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        new TextDocument();
        return iDocument;
    }
}

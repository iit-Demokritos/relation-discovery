/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.mit.ll.mitie;

public class EntityMentionVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EntityMentionVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EntityMentionVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        globalJNI.delete_EntityMentionVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EntityMentionVector() {
    this(globalJNI.new_EntityMentionVector__SWIG_0(), true);
  }

  public EntityMentionVector(long n) {
    this(globalJNI.new_EntityMentionVector__SWIG_1(n), true);
  }

  public long size() {
    return globalJNI.EntityMentionVector_size(swigCPtr, this);
  }

  public long capacity() {
    return globalJNI.EntityMentionVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    globalJNI.EntityMentionVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return globalJNI.EntityMentionVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    globalJNI.EntityMentionVector_clear(swigCPtr, this);
  }

  public void add(EntityMention x) {
    globalJNI.EntityMentionVector_add(swigCPtr, this, EntityMention.getCPtr(x), x);
  }

  public EntityMention get(int i) {
    return new EntityMention(globalJNI.EntityMentionVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, EntityMention val) {
    globalJNI.EntityMentionVector_set(swigCPtr, this, i, EntityMention.getCPtr(val), val);
  }

}

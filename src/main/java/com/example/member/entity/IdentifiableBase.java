package com.example.member.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Abstract implementation for {@link com.example.member.entity.Identifiable} POJOs. It includes default
 * implementations for the <code>toString()</code>, <code>equals(Object)</code>
 * and <code>hashCode</code> methods.
 *
 * @param <ID>
 *          the interface/class of the entity ID. It must extend/implement
 *          <code>Serializable</code>.
 */
@MappedSuperclass
public abstract class IdentifiableBase<ID extends Serializable> implements Identifiable<ID> {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected ID id;

  /**
   * Instantiates a new identifiable base.
   */
  public IdentifiableBase() {
    super();
  }

  /**
   * Instantiates a new identifiable base.
   *
   * @param id
   *          the id
   */
  public IdentifiableBase(ID id) {
    super();
    this.id = id;
  }

  /*
   * (non-Javadoc)
   *
   * @see com.example.member.entity.Identifiable#getId()
   */
  @Override
  public ID getId() {
    return id;
  }

  /*
   * (non-Javadoc)
   *
   * @see com.example.member.entity.Identifiable#setId(java.io.Serializable)
   */
  @Override
  public void setId(ID id) {
    this.id = id;
  }


}
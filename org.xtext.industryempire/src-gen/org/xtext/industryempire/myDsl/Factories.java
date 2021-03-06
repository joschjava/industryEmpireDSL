/**
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.industryempire.myDsl.Factories#getFactories <em>Factories</em>}</li>
 * </ul>
 *
 * @see org.xtext.industryempire.myDsl.MyDslPackage#getFactories()
 * @model
 * @generated
 */
public interface Factories extends Buildings
{
  /**
   * Returns the value of the '<em><b>Factories</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.industryempire.myDsl.SingleBuilding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factories</em>' containment reference list.
   * @see org.xtext.industryempire.myDsl.MyDslPackage#getFactories_Factories()
   * @model containment="true"
   * @generated
   */
  EList<SingleBuilding> getFactories();

} // Factories

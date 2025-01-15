/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal#getNeeds <em>Needs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getAnimal()
 * @model
 * @generated
 */
public interface Animal extends EObject {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.zoo_lang.Needs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getAnimal_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Needs> getNeeds();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getAnimal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Animal

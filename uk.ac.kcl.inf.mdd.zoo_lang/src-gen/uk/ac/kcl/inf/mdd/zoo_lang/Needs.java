/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Needs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getFood <em>Food</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getNeeds()
 * @model
 * @generated
 */
public interface Needs extends EObject {
	/**
	 * Returns the value of the '<em><b>Food</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.mdd.zoo_lang.Food#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food</em>' reference.
	 * @see #setFood(Food)
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getNeeds_Food()
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Food#getNeeds
	 * @model opposite="needs"
	 * @generated
	 */
	Food getFood();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getFood <em>Food</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food</em>' reference.
	 * @see #getFood()
	 * @generated
	 */
	void setFood(Food value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getNeeds_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // Needs

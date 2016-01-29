/**
 */
package transform;

import grammar.Grammar;

import graph.Graph;
import graph.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link transform.Transformation#getHote <em>Hote</em>}</li>
 *   <li>{@link transform.Transformation#getGrammar <em>Grammar</em>}</li>
 * </ul>
 * </p>
 *
 * @see transform.TransformPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Named {
	/**
	 * Returns the value of the '<em><b>Hote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hote</em>' reference.
	 * @see #setHote(Graph)
	 * @see transform.TransformPackage#getTransformation_Hote()
	 * @model
	 * @generated
	 */
	Graph getHote();

	/**
	 * Sets the value of the '{@link transform.Transformation#getHote <em>Hote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hote</em>' reference.
	 * @see #getHote()
	 * @generated
	 */
	void setHote(Graph value);

	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar</em>' reference.
	 * @see #setGrammar(Grammar)
	 * @see transform.TransformPackage#getTransformation_Grammar()
	 * @model
	 * @generated
	 */
	Grammar getGrammar();

	/**
	 * Sets the value of the '{@link transform.Transformation#getGrammar <em>Grammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar</em>' reference.
	 * @see #getGrammar()
	 * @generated
	 */
	void setGrammar(Grammar value);

} // Transformation

/**
 */
package grammar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see grammar.GrammarPackage
 * @generated
 */
public interface GrammarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarFactory eINSTANCE = grammar.impl.GrammarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar</em>'.
	 * @generated
	 */
	Grammar createGrammar();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>LHS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LHS</em>'.
	 * @generated
	 */
	LHS createLHS();

	/**
	 * Returns a new object of class '<em>RHS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RHS</em>'.
	 * @generated
	 */
	RHS createRHS();

	/**
	 * Returns a new object of class '<em>Embedding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedding</em>'.
	 * @generated
	 */
	Embedding createEmbedding();

	/**
	 * Returns a new object of class '<em>Connexion Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connexion Instruction</em>'.
	 * @generated
	 */
	ConnexionInstruction createConnexionInstruction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrammarPackage getGrammarPackage();

} //GrammarFactory

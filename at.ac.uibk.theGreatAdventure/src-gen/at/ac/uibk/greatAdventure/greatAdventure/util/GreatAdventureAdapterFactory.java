/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.util;

import at.ac.uibk.greatAdventure.greatAdventure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage
 * @generated
 */
public class GreatAdventureAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreatAdventurePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreatAdventureAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GreatAdventurePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreatAdventureSwitch<Adapter> modelSwitch =
    new GreatAdventureSwitch<Adapter>()
    {
      @Override
      public Adapter caseAdventure(Adventure object)
      {
        return createAdventureAdapter();
      }
      @Override
      public Adapter caseAdventureTitle(AdventureTitle object)
      {
        return createAdventureTitleAdapter();
      }
      @Override
      public Adapter caseItemDefinition(ItemDefinition object)
      {
        return createItemDefinitionAdapter();
      }
      @Override
      public Adapter caseUseDefinition(UseDefinition object)
      {
        return createUseDefinitionAdapter();
      }
      @Override
      public Adapter caseSceneDefinition(SceneDefinition object)
      {
        return createSceneDefinitionAdapter();
      }
      @Override
      public Adapter caseItemPositionDefinition(ItemPositionDefinition object)
      {
        return createItemPositionDefinitionAdapter();
      }
      @Override
      public Adapter caseStartDefinition(StartDefinition object)
      {
        return createStartDefinitionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure <em>Adventure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure
   * @generated
   */
  public Adapter createAdventureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle <em>Adventure Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle
   * @generated
   */
  public Adapter createAdventureTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition <em>Item Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition
   * @generated
   */
  public Adapter createItemDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition <em>Use Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition
   * @generated
   */
  public Adapter createUseDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition <em>Scene Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition
   * @generated
   */
  public Adapter createSceneDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition <em>Item Position Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition
   * @generated
   */
  public Adapter createItemPositionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition <em>Start Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.uibk.greatAdventure.greatAdventure.StartDefinition
   * @generated
   */
  public Adapter createStartDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GreatAdventureAdapterFactory

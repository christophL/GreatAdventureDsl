/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreatAdventureFactoryImpl extends EFactoryImpl implements GreatAdventureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GreatAdventureFactory init()
  {
    try
    {
      GreatAdventureFactory theGreatAdventureFactory = (GreatAdventureFactory)EPackage.Registry.INSTANCE.getEFactory(GreatAdventurePackage.eNS_URI);
      if (theGreatAdventureFactory != null)
      {
        return theGreatAdventureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GreatAdventureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreatAdventureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GreatAdventurePackage.ADVENTURE: return createAdventure();
      case GreatAdventurePackage.ADVENTURE_TITLE: return createAdventureTitle();
      case GreatAdventurePackage.ITEM_DEFINITION: return createItemDefinition();
      case GreatAdventurePackage.USE_DEFINITION: return createUseDefinition();
      case GreatAdventurePackage.SCENE_DEFINITION: return createSceneDefinition();
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION: return createItemPositionDefinition();
      case GreatAdventurePackage.START_DEFINITION: return createStartDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adventure createAdventure()
  {
    AdventureImpl adventure = new AdventureImpl();
    return adventure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdventureTitle createAdventureTitle()
  {
    AdventureTitleImpl adventureTitle = new AdventureTitleImpl();
    return adventureTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDefinition createItemDefinition()
  {
    ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
    return itemDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseDefinition createUseDefinition()
  {
    UseDefinitionImpl useDefinition = new UseDefinitionImpl();
    return useDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDefinition createSceneDefinition()
  {
    SceneDefinitionImpl sceneDefinition = new SceneDefinitionImpl();
    return sceneDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemPositionDefinition createItemPositionDefinition()
  {
    ItemPositionDefinitionImpl itemPositionDefinition = new ItemPositionDefinitionImpl();
    return itemPositionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartDefinition createStartDefinition()
  {
    StartDefinitionImpl startDefinition = new StartDefinitionImpl();
    return startDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreatAdventurePackage getGreatAdventurePackage()
  {
    return (GreatAdventurePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GreatAdventurePackage getPackage()
  {
    return GreatAdventurePackage.eINSTANCE;
  }

} //GreatAdventureFactoryImpl

/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Position Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl#getItem <em>Item</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl#getYpos <em>Ypos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemPositionDefinitionImpl extends MinimalEObjectImpl.Container implements ItemPositionDefinition
{
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected ItemDefinition item;

  /**
   * The default value of the '{@link #getXpos() <em>Xpos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpos()
   * @generated
   * @ordered
   */
  protected static final int XPOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXpos() <em>Xpos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpos()
   * @generated
   * @ordered
   */
  protected int xpos = XPOS_EDEFAULT;

  /**
   * The default value of the '{@link #getYpos() <em>Ypos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpos()
   * @generated
   * @ordered
   */
  protected static final int YPOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYpos() <em>Ypos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpos()
   * @generated
   * @ordered
   */
  protected int ypos = YPOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemPositionDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreatAdventurePackage.Literals.ITEM_POSITION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDefinition getItem()
  {
    if (item != null && item.eIsProxy())
    {
      InternalEObject oldItem = (InternalEObject)item;
      item = (ItemDefinition)eResolveProxy(oldItem);
      if (item != oldItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDefinition basicGetItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItem(ItemDefinition newItem)
  {
    ItemDefinition oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getXpos()
  {
    return xpos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXpos(int newXpos)
  {
    int oldXpos = xpos;
    xpos = newXpos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_POSITION_DEFINITION__XPOS, oldXpos, xpos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYpos()
  {
    return ypos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYpos(int newYpos)
  {
    int oldYpos = ypos;
    ypos = newYpos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_POSITION_DEFINITION__YPOS, oldYpos, ypos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__XPOS:
        return getXpos();
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__YPOS:
        return getYpos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM:
        setItem((ItemDefinition)newValue);
        return;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__XPOS:
        setXpos((Integer)newValue);
        return;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__YPOS:
        setYpos((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM:
        setItem((ItemDefinition)null);
        return;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__XPOS:
        setXpos(XPOS_EDEFAULT);
        return;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__YPOS:
        setYpos(YPOS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__ITEM:
        return item != null;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__XPOS:
        return xpos != XPOS_EDEFAULT;
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION__YPOS:
        return ypos != YPOS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (xpos: ");
    result.append(xpos);
    result.append(", ypos: ");
    result.append(ypos);
    result.append(')');
    return result.toString();
  }

} //ItemPositionDefinitionImpl

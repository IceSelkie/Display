package hyec.display;

/**
 * class WindowSize
 * <p>
 * Represents the size of a window.
 */
public class WindowSize
{
  /**
   * The width of the window.
   */
  public final int w;
  /**
   * The height of the window.
   */
  public final int h;

  /**
   * Constructor for WindowSize.
   *
   * @param width  The width of the window.
   * @param height The height of the height.
   */
  public WindowSize(int width, int height)
  {
    w = width;
    h = height;
  }

  /**
   * @return the width of the window
   */
  public int getWidth()
  {
    return w;
  }

  /**
   * @return the height of the window
   */
  public int getHeight()
  {
    return h;
  }

  /**
   * Converts this {@code WindowSize} to a {@link String}.
   *
   * @return This object as a {@link String}.
   */
  public String toString()
  {
    return "WindowSize[width=" + w + ",height=" + h + "]";
  }
}
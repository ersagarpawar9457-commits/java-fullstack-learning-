# 🎨 CSS Flexbox & Grid

> Quick reference for layout techniques
> **Covered in:** Offline Classes ✅

---

## 📦 Flexbox

### Container Properties

```css
.container {
    display: flex;
    
    /* Direction */
    flex-direction: row | column | row-reverse | column-reverse;
    
    /* Wrap */
    flex-wrap: nowrap | wrap | wrap-reverse;
    
    /* Main axis alignment */
    justify-content: flex-start | center | flex-end | space-between | space-around | space-evenly;
    
    /* Cross axis alignment */
    align-items: stretch | flex-start | center | flex-end | baseline;
    
    /* Multiple lines alignment */
    align-content: flex-start | center | flex-end | space-between | space-around;
    
    /* Gap between items */
    gap: 10px;
}
```

### Item Properties

```css
.item {
    /* Growth factor */
    flex-grow: 0;    /* Don't grow */
    flex-grow: 1;    /* Grow equally */
    
    /* Shrink factor */
    flex-shrink: 1;  /* Can shrink */
    
    /* Base size */
    flex-basis: auto | 200px | 50%;
    
    /* Shorthand */
    flex: 1;         /* flex-grow: 1 */
    flex: 1 1 200px; /* grow shrink basis */
    
    /* Individual alignment */
    align-self: auto | flex-start | center | flex-end;
    
    /* Order */
    order: 0;        /* Default */
}
```

### Common Patterns

```css
/* Center everything */
.center-all {
    display: flex;
    justify-content: center;
    align-items: center;
}

/* Space between with wrap */
.card-container {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: space-between;
}

/* Sticky footer */
.page {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
}
.main { flex: 1; }
```

---

## 🔲 CSS Grid

### Container Properties

```css
.container {
    display: grid;
    
    /* Define columns */
    grid-template-columns: 200px 1fr 200px;
    grid-template-columns: repeat(3, 1fr);
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    
    /* Define rows */
    grid-template-rows: 100px auto 100px;
    
    /* Gap */
    gap: 20px;
    row-gap: 10px;
    column-gap: 20px;
    
    /* Alignment */
    justify-items: start | center | end | stretch;
    align-items: start | center | end | stretch;
    
    /* Content alignment */
    justify-content: start | center | end | space-between;
    align-content: start | center | end | space-between;
}
```

### Item Properties

```css
.item {
    /* Span columns */
    grid-column: 1 / 3;        /* Start at 1, end before 3 */
    grid-column: span 2;       /* Span 2 columns */
    
    /* Span rows */
    grid-row: 1 / 3;
    grid-row: span 2;
    
    /* Both */
    grid-area: 1 / 1 / 3 / 3;  /* row-start / col-start / row-end / col-end */
    
    /* Self alignment */
    justify-self: start | center | end;
    align-self: start | center | end;
}
```

### Common Patterns

```css
/* Responsive card grid */
.cards {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
    gap: 20px;
}

/* Classic layout */
.page {
    display: grid;
    grid-template-columns: 200px 1fr 200px;
    grid-template-rows: auto 1fr auto;
    grid-template-areas:
        "header header header"
        "sidebar main aside"
        "footer footer footer";
}
.header { grid-area: header; }
.sidebar { grid-area: sidebar; }
.main { grid-area: main; }
.aside { grid-area: aside; }
.footer { grid-area: footer; }
```

---

## 📊 Flexbox vs Grid

| Feature | Flexbox | Grid |
|---------|---------|------|
| Dimension | 1D (row OR column) | 2D (rows AND columns) |
| Best for | Components, nav bars | Page layouts, galleries |
| Content vs Layout | Content-first | Layout-first |
| Alignment | Excellent | Excellent |

**Rule of thumb:**
- **Flexbox:** Navigation, buttons, single row/column
- **Grid:** Page layouts, card grids, complex layouts

---

## 💡 Quick Tips

1. Use `fr` units for flexible grids
2. `minmax()` for responsive without media queries
3. `auto-fit` vs `auto-fill` — fit collapses empty, fill doesn't
4. Combine Flexbox inside Grid items!

---

*Great job completing these in class! Practice by rebuilding your portfolio layout.*

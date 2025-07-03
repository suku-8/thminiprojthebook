import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/authors',
      component: () => import('../components/ui/AuthorGrid.vue'),
    },
    {
      path: '/writings',
      component: () => import('../components/ui/WritingGrid.vue'),
    },
    {
      path: '/approvalAuthors',
      component: () => import('../components/ApprovalAuthorView.vue'),
    },
    {
      path: '/coverDesigns',
      component: () => import('../components/ui/CoverDesignGrid.vue'),
    },
    {
      path: '/contentAnalyzers',
      component: () => import('../components/ui/ContentAnalyzerGrid.vue'),
    },
    {
      path: '/points',
      component: () => import('../components/ui/PointGrid.vue'),
    },
    {
      path: '/libraryInfos',
      component: () => import('../components/ui/LibraryInfoGrid.vue'),
    },
    {
      path: '/users',
      component: () => import('../components/ui/UserGrid.vue'),
    },
    {
      path: '/libraries',
      component: () => import('../components/ui/LibraryGrid.vue'),
    },
  ],
})

export default router;
